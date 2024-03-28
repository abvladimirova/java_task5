package ru.vtb.task5.mebmvcexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vtb.task5.mebmvcexample.MyModel;
import ru.vtb.task5.mebmvcexample.Summator;


// Get - получить данные
// Post - разместить данные
// Put - положить что-то
// Patch - частично дозаполнить
// Delete - удалить
@RestController
public class MyRestController {
    @Autowired
    Summator s;
    /*@GetMapping("/sum")
    public MyModel handle(@RequestBody MyModel model) {
        // логику выносим в @Service
        // работу с данными в репозитории
        // представления - через шаблонизиторы

        model.res = s.getSum(model.x, model.y);
        return model;
    }*/

    @GetMapping("/client/{name}")
    public ResponseEntity<MyModel> handleName(@RequestBody MyModel model, @PathVariable("name") String name) {
        model.res = s.getSum(model.x, model.y);
        model.name = name;
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(model);
    }
    /*@GetMapping("/client/{name}")
    public MyModel handleName2(*//*@RequestBody MyModel model, *//*@PathVariable String name) {
        MyModel model = new MyModel(); model.name = name;
        return model;
    }*/

}
