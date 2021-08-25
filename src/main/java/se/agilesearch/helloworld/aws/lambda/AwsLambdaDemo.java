package se.agilesearch.helloworld.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import se.agilesearch.helloworld.aws.lambda.valueobjects.SalesOrder;

public class AwsLambdaDemo implements RequestHandler<SalesOrder, String> {
    @Override
    public String handleRequest(SalesOrder salesOrder, Context context) {
        return "Hello Buddy, the order is " + salesOrder;
    }
}
