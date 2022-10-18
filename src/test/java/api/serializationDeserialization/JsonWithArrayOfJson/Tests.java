package api.serializationDeserialization.JsonWithArrayOfJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    @Test
    public void showJson() throws JsonProcessingException {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setCountry("Columbia");
        orderDetail.setProductOrderedId("12345");

        List<OrderDetail> orderDetailList = new ArrayList<>();
        orderDetailList.add(orderDetail);

        Orders orders = new Orders();
        orders.setOrders(orderDetailList);

        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orders);
        System.out.println(result);
    }
}
