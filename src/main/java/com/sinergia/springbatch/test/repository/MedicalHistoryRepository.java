package com.sinergia.springbatch.test.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sinergia.springbatch.test.domain.MedicalHistory;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
	
	
//	@Query("SELECT DISTINCT m FROM User u, MovieWatched mw, Movie m WHERE mw.movie.id = m.id AND mw.user.id = u.id AND YEAR(u.birthDate) = :birthYear")
//  public Collection<Movie> findTopTenMovies(@Param("birthYear")Integer birthYear);
//	
//	@Query("SELECT DISTINCT m FROM User u, MovieWatched mw, Movie m WHERE mw.movie.id = m.id AND mw.user.id = u.id AND u.id=:idUser ORDER BY m.averangeRate DESC ")
//	public Collection<Movie> findAllMovies(@Param("idUser") Long idUser);
//	
//	@Query("SELECT m.averangeRate FROM Movie m WHERE m.id=:movieId")
//	public Float getAverangeRating(@Param("movieId") Long movieId);
//	
//	@Query("SELECT DISTINCT m FROM State s, User u, MovieWatched mw, Movie m WHERE s.id = u.state.id AND mw.movie.id = m.id AND mw.user.id = u.id AND s.name=:state AND HOUR(mw.dateWatched) <= 23 AND HOUR(mw.dateWatched) >= 6 AND MINUTE(mw.dateWatched) <= 59  ORDER BY m.averangeRate DESC ")
//	public Collection<Movie> getTop20Movies(@Param("state") String state);
//	
//	@Query("SELECT DISTINCT m FROM User u, MovieWatched mw, Movie m join m.genres g WHERE mw.movie.id = m.id AND mw.user.id = u.id AND g.name=:genre AND u.id=:idUser ORDER BY m.averangeRate DESC ")
//	public Collection<Movie> getTop5(@Param("genre") String genre, @Param("idUser") Long idUser);
	
}