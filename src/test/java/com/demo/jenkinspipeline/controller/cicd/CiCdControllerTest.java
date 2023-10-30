package com.demo.jenkinspipeline.controller.cicd;

import com.demo.jenkinspipeline.config.CiCdConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CiCdControllerTest {

    private static final String CI_CD_PATH = "/api/v1/ci-cd";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CiCdConfig ciCdConfig;

    @Test
    public void shouldGetCiCdConfig() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(CI_CD_PATH))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data.agent").value(ciCdConfig.getAgent()))
                .andExpect(jsonPath("$.data.version").value(ciCdConfig.getVersion()))
                .andExpect(jsonPath("$.data.cloud").value(ciCdConfig.getCloud()));
    }

}