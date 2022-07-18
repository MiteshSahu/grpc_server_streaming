package com.example.project.protobuf.service;

import com.example.project.protobuf.pb.Filter;
import com.example.project.protobuf.pb.Laptop;
import io.grpc.Context;


public interface LaptopStore {
    void Save(Laptop laptop) throws Exception;
    Laptop Find(String id);
    void Search(Context context,Filter filter, LaptopStream stream);
}

