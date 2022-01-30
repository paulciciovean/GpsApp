package paul.ciciovean.gps.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import paul.ciciovean.gps.model.Position;

public interface PositionRepo extends JpaRepository<Position,Long>{
	
	Optional<Position> findById(Long id);

}
