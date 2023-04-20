package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.aws.codestar.projecttemplates.GatewayResponse;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Handler for requests to Lambda function.
 */
public class HelloWorldHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        JSONObject message1 = new JSONObject().put("Output", "Hello World!");
        JSONObject message2 = new JSONObject().put("Output", "Hello ASSYST!");
        return new GatewayResponse(message1.toString() + "\n" + message2.toString(), headers, 200);
    }
}
