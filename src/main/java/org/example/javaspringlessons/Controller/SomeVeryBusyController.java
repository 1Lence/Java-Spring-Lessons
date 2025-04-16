package org.example.javaspringlessons.Controller;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.service.SomeAsyncService;
import org.example.javaspringlessons.service.SomeCommonService;
import org.example.javaspringlessons.service.SomeTransactionalService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class SomeVeryBusyController {

    private final SomeCommonService someCommonService;
    private final SomeAsyncService someAsyncService;
    private final SomeTransactionalService someTransactionalService;


    @GetMapping(path = "/common")
    public void getCommon(){
        someCommonService.someBusinessLogic();
        //Проверяю работу блокировок
        someCommonService.someBusinessLogic();
    }

    @GetMapping(path = "/async")
    public void getAsync(){
        someAsyncService.someBusinessLogic();
        //Проверяю работу блокировок
        someAsyncService.someBusinessLogic();
    }

    @GetMapping(path = "/trans")
    public void getTransact()  {
        someTransactionalService.firstTransact();
        someTransactionalService.secondTransact();
    }
}