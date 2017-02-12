package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by hasoji on 2017/2/11.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test() {
        return "Hello world";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public Object json(@RequestParam(value = "key", required = false, defaultValue = "") String key,
                       @RequestParam(value = "value", required = false, defaultValue = "") Object value) {
        HashMap<String, Object> json = new HashMap<>();
        if (key.length() == 0 && String.valueOf(value).length() == 0)
            return json;
        json.put(key, value);
        return json;
    }

    @RequestMapping(value = "/{path}", method = RequestMethod.GET)
    public Object path(@PathVariable("path") String path, @RequestParam(value = "key", required = false, defaultValue = "") String key,
                       @RequestParam(value = "value", required = false, defaultValue = "") Object value) {
        HashMap<String, Object> json = new HashMap<>();
        json.put("path", path);
        if (key.length() == 0 && String.valueOf(value).length() == 0)
            return json;
        json.put(key, value);
        return json;
    }
}
