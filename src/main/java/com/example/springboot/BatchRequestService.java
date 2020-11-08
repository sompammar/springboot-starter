package com.example.springboot;

import org.springframework.stereotype.Service;

@Service
public class BatchRequestService implements IBatchRequestService {
    @Override
    public void executeReq(BatchRequest req) {
        System.out.println("Executing req");
        System.out.println(JsonUtil.toJson(req));
    }
}
