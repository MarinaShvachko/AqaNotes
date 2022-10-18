package api.serializationDeserialization.JsonWithArrayOfJson;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Orders {
    private List<OrderDetail> orders;
}
