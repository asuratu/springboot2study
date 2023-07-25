package com.heima.controller;

import org.springframework.web.bind.annotation.*;


/**
 * @author asura
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/users2")
public class User2Controller {
    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @PostMapping
//    @RequestMapping(method = RequestMethod.POST)
    public String save(@RequestBody User user) {
        System.out.println("user2 save..." + user);
        return "{'module':'user2 save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("user2 delete..." + id);
        return "{'module':'user2 delete'}";
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("user2 update..." + user);
        return "{'module':'user2 update'}";
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("user2 getById..." + id);
        return "{'module2':'user2 getById'}";
    }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getAll() {
        System.out.println("user2 getAll...");
        return "{'module':'user2 getAll'}";
    }
}
