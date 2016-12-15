package org.yesworkflow.actorcontainer.controller;

import java.io.File;
import java.io.Writer;
import java.util.Map;
import java.util.HashMap;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

@RestController 
@EnableAutoConfiguration
@CrossOrigin 
@RequestMapping("${yw-actor-container-service.url}/")
public class ActorContainerController {
    
    @RequestMapping(value="/status", method=RequestMethod.GET)
    public @ResponseBody String getStatus() throws Exception {
        return "UP";
	}
}
