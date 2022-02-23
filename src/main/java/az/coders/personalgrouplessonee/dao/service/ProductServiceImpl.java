package az.coders.personalgrouplessonee.dao.service;

import az.coders.personalgrouplessonee.dao.entity.ProductEntity;
import az.coders.personalgrouplessonee.dao.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(ProductEntity object) {
        repository.save(object);
    }

    @Override
    public List<ProductEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductEntity getById(long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
    }

    @Override
    public void update(ProductEntity object) {
        ProductEntity product = getById(object.getId());
        product.setName(object.getName());
        product.setPrice(object.getPrice());
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
