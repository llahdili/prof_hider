package com.io.prof_hider;

import com.io.prof_hider.domaine.EmpVo;
import com.io.prof_hider.domaine.RoleVo;
import com.io.prof_hider.domaine.UserVo;
import com.io.prof_hider.service.IEmpService;
import com.io.prof_hider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProfHiderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProfHiderApplication.class, args);
	}

}
