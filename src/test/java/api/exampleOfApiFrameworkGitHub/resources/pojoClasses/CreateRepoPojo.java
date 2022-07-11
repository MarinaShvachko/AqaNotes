package api.exampleOfApiFrameworkGitHub.resources.pojoClasses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRepoPojo {
    private String name;
    private String description;
}