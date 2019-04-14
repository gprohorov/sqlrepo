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
public class GrupaServiceImpl {
    @Autowired
    GrupaRepository repository;
    @PostConstruct
    void init(){
        List<Grupa> grupas = new ArrayList<>(
                Arrays.asList(
                        new Grupa("243", "Ostapov"),
                        new Grupa("244", "Grisha"),
                        new Grupa("245", "Drin")
                )
        );
        grupas.forEach(grupa -> {

            System.out.println(repository.save(grupa));
        });
    }



}
