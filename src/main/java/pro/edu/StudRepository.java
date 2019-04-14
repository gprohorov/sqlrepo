package pro.edu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by george on 14.04.19.
 */
@Repository
public interface StudRepository extends JpaRepository<Stud, Integer> {
}
