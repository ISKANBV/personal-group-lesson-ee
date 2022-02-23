package az.coders.personalgrouplessonee.dao.controller;

import az.coders.personalgrouplessonee.dao.entity.ProductEntity;
import az.coders.personalgrouplessonee.dao.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControllerImpl implements ProductController {

    private final ProductService service;

    public ProductControllerImpl(ProductService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/add")
    public void add(@RequestBody ProductEntity product) {
        service.add(product);
    }

    @Override
    @GetMapping("/all")
    public List<ProductEntity> getAll() {
        return service.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public ProductEntity getById(@PathVariable(value = "id") long id) {
        return service.getById(id);
    }

    @Override
    @PutMapping("/")
    public void update(@RequestBody ProductEntity product) {
        service.update(product);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") long id) {
        service.delete(id);
    }

    @Override
    @DeleteMapping("/all")
    public void deleteAll() {
        service.deleteAll();
    }

}
