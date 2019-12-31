package technology.kie.farmrcart.brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BrandController {
    @Autowired
    private BrandRepository brandRepository;
    @GetMapping("/brand")
    public List<Brand> retrieveAllBrands(){
        return brandRepository.findAll();
    }

    @GetMapping("/brand/{id}")
    public Brand retrieveBrand(@PathVariable Long id){
        Optional<Brand> student = brandRepository.findById(id);

        if (!student.isPresent())
            throw new BrandNotFoundException("id-" + id);
        return student.get();

    }




}
