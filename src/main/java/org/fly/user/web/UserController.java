package org.fly.user.web;


import org.fly.base.web.BaseController;
import org.fly.user.biz.UserBizImpl;
import org.fly.user.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/profile")
public class UserController extends BaseController<User> {

    @Autowired
    private UserBizImpl userBiz;

    @RequestMapping(value = "/savem", method = RequestMethod.GET)
    public Object save(@RequestParam("name") String name,
                       @RequestParam("family") String family,
                       @RequestParam("fatherName") String fatherName,
                       @RequestParam("gender") String gender,
                       @RequestParam("maritalStatus") String maritalStatus,
                       @RequestParam("children") String children,
                       @RequestParam("birthday") String birthday,
                       @RequestParam("nationalCode") String nationalCode,
                       @RequestParam("militaryServiceStatus") String militaryServiceStatus,
                       @RequestParam("city") String city,
                       @RequestParam("address") String address,
                       @RequestParam("workPhoneNumber") String workPhoneNumber) {
        User user = new User();
        user.setName(name).setFamily(family).setFatherName(fatherName)
                .setGender(gender).setMaritalStatus(maritalStatus).setChildren(Long.parseLong(children))
                .setBirthday(birthday).setNationalCode(Long.parseLong(nationalCode)).setMilitaryServiceStatus(militaryServiceStatus)
                .setCity(city).setAddress(address).setWorkPhoneNumber(Long.parseLong(workPhoneNumber));
        userBiz.save(user);
        return "index";
    }

}
