package com.demo.jenkinspipeline.controller.cicd;

public record CiCdResponse(
        String agent,
        String version,
        String cloud
) {
}
