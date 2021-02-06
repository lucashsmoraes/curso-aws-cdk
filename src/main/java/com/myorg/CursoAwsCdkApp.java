package com.myorg;

import software.amazon.awscdk.core.App;

import java.util.Arrays;

public class CursoAwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack vpc = new VpcStack(app, "VPC");
        new ClusterStack(app, "CLUSTER", vpc.getVpc());

        app.synth();
    }
}