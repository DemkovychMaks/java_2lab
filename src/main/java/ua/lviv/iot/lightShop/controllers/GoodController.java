package ua.lviv.iot.lightShop.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.lightShop.models.Good;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/good")
@RestController
public class GoodController {
    private final Map<Integer, Good> goods = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public Collection<Good> getGoods() {
        return new ArrayList<Good>(goods.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Good> getGood(@PathVariable("id") Integer id) {

        if (goods.get(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(goods.get(id));

    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Good createGoods(final @RequestBody Good good) {
        good.setId(idCounter.incrementAndGet());
        goods.put(good.getId(), good);
        return good;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Good> deleteGoods(@PathVariable("id") int id) {
        HttpStatus status;
        if (goods.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            goods.remove(id);
        }
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Good> updateGoods(final @PathVariable("id") int id, final @RequestBody Good good) {
        HttpStatus status;
        if (goods.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            good.setId(id);
            goods.put(id, good);
        }
        return ResponseEntity.status(status).build();
    }
}