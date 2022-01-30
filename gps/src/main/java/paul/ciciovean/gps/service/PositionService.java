package paul.ciciovean.gps.service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paul.ciciovean.gps.model.Position;
import paul.ciciovean.gps.repo.PositionRepo;

@Service
public class PositionService {
	private PositionRepo positionRepo;
	
	@Autowired
	public PositionService(PositionRepo positionRepo)
	{
		this.positionRepo=positionRepo;
	}
	
	public Position addPosition(Position position)
	{
		position.setDateTime(Instant.now());
		return positionRepo.save(position);
	}
	
	public List<Position> getAllPositions()
	{
		return positionRepo.findAll();
	}
	
	public Optional<Position> findPositionById(Long id)
	{
		return positionRepo.findById(id);
	}
	public void deleteById(Long id)
	{
		 positionRepo.deleteById(id);
	}
}
