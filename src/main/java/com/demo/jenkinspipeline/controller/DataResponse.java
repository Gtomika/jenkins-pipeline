package com.demo.jenkinspipeline.controller;

public record DataResponse<T>(
        T data
) {
}
