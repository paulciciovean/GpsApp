package paul.ciciovean.gps;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import paul.ciciovean.gps.service.PositionService;
import paul.ciciovean.gps.model.Position;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/position")
@CrossOrigin("*")
public class GpsController {
	private PositionService ps;
	
	public GpsController(PositionService ps )
	{
		this.ps =ps;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Position>> getAllPositions()
	{
		List<Position> positions = ps.getAllPositions();
		return new ResponseEntity<>(positions,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Position> addPosition(@RequestBody Position position)
	{
		Position newPosition = ps.addPosition(position);
		return new ResponseEntity<>(newPosition,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Position>> getPositionById(@PathVariable("id") Long id )
	{
		Optional<Position> position = ps.findPositionById(id);
		return new ResponseEntity<>(position,HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePositionById(@PathVariable("id") Long id)
	{
		ps.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
