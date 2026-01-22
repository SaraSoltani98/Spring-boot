package se.iths.sara.springboot.Service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String helloFromService() {
        return "Hello from service";
    }

}
