package com.challenage.server.server.Control;

import com.challenage.server.server.Entity.Locker;
import com.challenage.server.server.Entity.User;
import com.challenage.server.server.Service.LockerService;
import com.challenage.server.server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class EntityController {
    @Autowired
    private LockerService lockerService;


    @Autowired
    UserService userService;

    @RequestMapping(value="/adduser",method = RequestMethod.GET)
    @ResponseBody
    public User addUser(@RequestParam("name")String name, @RequestParam("phonenumber")String phonenumber,
                        @RequestParam("sex")String sex, @RequestParam("city")String city, @RequestParam("credit")int credit, Model model){
        User user = new User(name,credit,phonenumber,sex,city);
        userService.add(user);
        model.addAttribute("user",user);
        return user;
    }

    @RequestMapping(value="/index")
    public String ListUsers(Model model){
        List<User> users = userService.findAllUser();
        model.addAttribute("users",users);
        List<Locker> lockers = lockerService.findAllLocker();
        model.addAttribute("lockers",lockers);
        return "index";
    }

    @RequestMapping(value="/blank")
    public String Blank(Model model){
        List<User> users = userService.findAllUser();
        model.addAttribute("users",users);
        return "blank";
    }

    @RequestMapping(value="/charts")
    public String Charts(Model model){
        List<Locker> lockers = lockerService.findAllLocker();
        model.addAttribute("lockers",lockers);
        return "charts";
    }

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String test(Model model){
        List<Locker> lockers = lockerService.findAllLocker();
        model.addAttribute("lockers",lockers);
        return "test";
    }

    @RequestMapping(value ="/list")
    @ResponseBody
    public List<Locker> list(Model model){
        List<User> users = userService.findAllUser();
        List<Locker> lockers = lockerService.findAllLocker();
        model.addAttribute("users",users);
        model.addAttribute("lockers",lockers);
        return lockers;
    }
    /*@Autowired
    private LockerRepository lockerRepository;

    //查找地锁
    @RequestMapping(value="/{locker}",method=RequestMethod.GET)
    public String FindLocker(@PathVariable("locker") String locker, Model model){
        List<Locker> LockerList = lockerRepository.findByLocation(locker);
        if(LockerList!=null){
            model.addAttribute("lockers",LockerList);
        }
        return "index";
    }


    //添加地锁
    @RequestMapping(value="/{locker}",method=RequestMethod.POST)
    public String addLocker(@PathVariable("locker") Locker locker){
        lockerRepository.save(locker);
        return "redirect:/{index}";
    }

    //显示所有地锁信息
    @RequestMapping("/")
    public String showAllLockers(){
        List<Locker> lockerList = lockerRepository.findAll();
        return "index";
    }
    @GetMapping(value="/list")
    public List<Locker> getLockerList(){
        return this.lockerRepository.findAll();
    }*/


}
