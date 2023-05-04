package pro.sky.skyproshoppingcart.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyproshoppingcart.Service.StoreService;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public String welcome() {
        return "WELCOME";
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> values) {
        storeService.addAllPurchases(values);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return storeService.getAllPurchases();
    }


}
