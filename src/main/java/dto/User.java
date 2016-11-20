package dto;

import lombok.Value;

/**
 * Created by zzl on 16/11/20.
 */
@Value
public class User {
    private String username;
    private String password;
    private int userType;
}
