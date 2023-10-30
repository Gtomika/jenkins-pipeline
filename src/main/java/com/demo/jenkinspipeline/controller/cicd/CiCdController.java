package com.demo.jenkinspipeline.controller.cicd;

import com.demo.jenkinspipeline.config.CiCdConfig;
import com.demo.jenkinspipeline.controller.DataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ci-cd")
@RequiredArgsConstructor
public class CiCdController {

    private final CiCdConfig ciCdConfig;

    @GetMapping
    public DataResponse<CiCdResponse> getCiCdInfo() {
        var info = new CiCdResponse(
                ciCdConfig.getAgent(),
                ciCdConfig.getVersion(),
                ciCdConfig.getCloud());
        return new DataResponse<>(info);
    }

}
