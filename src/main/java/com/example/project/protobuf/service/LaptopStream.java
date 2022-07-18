package com.example.project.protobuf.service;

import com.example.project.protobuf.pb.Laptop;

public interface LaptopStream {
    void Send(Laptop laptop);
}
