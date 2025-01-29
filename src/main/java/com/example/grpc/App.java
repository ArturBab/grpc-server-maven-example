package com.example.grpc;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Создаём сервер на порту 9090 и добавляем реализацию GreeterServiceImpl
        Server server = ServerBuilder.forPort(9090).addService(new GreeterServiceImpl()).build();
        System.out.println("Starting gRPC server on port 9090...");
        server.start();

        // Добавляем shutdown hook для корректной остановки сервера
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server...");
            server.shutdown();
        }));
        // Блокируем поток, чтобы сервер продолжал работать
        server.awaitTermination();
    }
}
