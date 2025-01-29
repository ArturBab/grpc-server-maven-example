package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Определение сервиса
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: greet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterServiceGrpc {

  private GreeterServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.GreeterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Greet.HelloRequest,
      com.example.grpc.Greet.HelloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.example.grpc.Greet.HelloRequest.class,
      responseType = com.example.grpc.Greet.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Greet.HelloRequest,
      com.example.grpc.Greet.HelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Greet.HelloRequest, com.example.grpc.Greet.HelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterServiceGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayHelloMethod = GreeterServiceGrpc.getSayHelloMethod) == null) {
          GreeterServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Greet.HelloRequest, com.example.grpc.Greet.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Greet.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Greet.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceStub>() {
        @java.lang.Override
        public GreeterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceStub(channel, callOptions);
        }
      };
    return GreeterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceBlockingStub>() {
        @java.lang.Override
        public GreeterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceBlockingStub(channel, callOptions);
        }
      };
    return GreeterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceFutureStub>() {
        @java.lang.Override
        public GreeterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceFutureStub(channel, callOptions);
        }
      };
    return GreeterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Определение сервиса
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(com.example.grpc.Greet.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Greet.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GreeterService.
   * <pre>
   * Определение сервиса
   * </pre>
   */
  public static abstract class GreeterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GreeterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GreeterService.
   * <pre>
   * Определение сервиса
   * </pre>
   */
  public static final class GreeterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GreeterServiceStub> {
    private GreeterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.example.grpc.Greet.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Greet.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GreeterService.
   * <pre>
   * Определение сервиса
   * </pre>
   */
  public static final class GreeterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GreeterServiceBlockingStub> {
    private GreeterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Greet.HelloResponse sayHello(com.example.grpc.Greet.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GreeterService.
   * <pre>
   * Определение сервиса
   * </pre>
   */
  public static final class GreeterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GreeterServiceFutureStub> {
    private GreeterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Greet.HelloResponse> sayHello(
        com.example.grpc.Greet.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.example.grpc.Greet.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Greet.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Greet.HelloRequest,
              com.example.grpc.Greet.HelloResponse>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class GreeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreeterService");
    }
  }

  private static final class GreeterServiceFileDescriptorSupplier
      extends GreeterServiceBaseDescriptorSupplier {
    GreeterServiceFileDescriptorSupplier() {}
  }

  private static final class GreeterServiceMethodDescriptorSupplier
      extends GreeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GreeterServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
