package com.example.project.protobuf.service;

import com.example.project.protobuf.pb.CreateLaptopRequest;
import com.example.project.protobuf.pb.CreateLaptopResponse;
import com.example.project.protobuf.pb.Laptop;
import com.example.project.protobuf.pb.LaptopServiceGrpc;
import com.example.project.protobuf.sample.Generator;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LaptopServerTest {

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();
    private LaptopStore store;
    private LaptopServer server;
    private ManagedChannel channel;
    @Before
    void setUp() throws IOException {
        String serverName = InProcessServerBuilder.generateName();
        InProcessServerBuilder serverBuilder = InProcessServerBuilder.forName(serverName).directExecutor();

        store = new InMemoryLaptopStore();

        server = new LaptopServer(serverBuilder, 0, store);
        server.start();

        channel = grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build());

    }

    @After
    void tearDown() throws InterruptedException {
        server.stop();
    }

    @Test
    public void createLaptopWithAValidID(){
        Generator generator = new Generator();
        Laptop laptop = generator.NewLaptop().toBuilder().setId("i").build();
        CreateLaptopRequest request = CreateLaptopRequest.newBuilder().setLaptop(laptop).build();

        LaptopServiceGrpc.LaptopServiceBlockingStub stub = LaptopServiceGrpc.newBlockingStub(channel);
        CreateLaptopResponse response = stub.createLaptop(request);
        assertNotNull(response);
        assertEquals(laptop.getId(), response.getId());

        Laptop found = store.Find(response.getId());
        assertNotNull(found);
    }

    @Test
    public void createLaptopWithAnEmptyID() {
        Generator generator = new Generator();
        Laptop laptop = generator.NewLaptop().toBuilder().setId("").build();
        CreateLaptopRequest request = CreateLaptopRequest.newBuilder().setLaptop(laptop).build();

        LaptopServiceGrpc.LaptopServiceBlockingStub stub = LaptopServiceGrpc.newBlockingStub(channel);
        CreateLaptopResponse response = stub.createLaptop(request);
        assertNotNull(response);
        assertFalse(response.getId().isEmpty());

        Laptop found = store.Find(response.getId());
        assertNotNull(found);
    }

}