package com.io.prof_hider.domaine;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TokenVo implements Serializable {
    private static final long serialVersionUID = -8983972106948531914L;
    private String username;
    private String jwttoken;
    private List<String> roles = new ArrayList<>();

}
