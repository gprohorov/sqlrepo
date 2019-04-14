package pro.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by george on 14.04.19.
 */
@Service
public class StudServiceImpl {
    @Autowired
    GrupaRepository grupaRepository;
    @Autowired
    StudRepository repository;
    @PostConstruct
    void init(){
        Grupa grupa = grupaRepository.findAll().get(0);
        System.out.println(grupa);
        List<Stud> studs = new ArrayList<>(

                Arrays.asList(
                        new Stud(1, "ivanov", grupa)
                )
        );
        repository.saveAll(studs);

    }



}
