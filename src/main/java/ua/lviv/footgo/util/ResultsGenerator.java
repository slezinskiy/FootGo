package ua.lviv.footgo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.lviv.footgo.entity.*;
import ua.lviv.footgo.repository.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResultsGenerator {

    public static final Integer NUMBER_OF_TEAMS = 10;
    public static final Integer NUMBER_OF_PLAYERS_IN_TEAM = 11;
    public static final Integer NUMBER_OF_TOURS = 9;
    public static final Integer NUMBER_OF_GAMES_IN_TOUR = 5;


    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GoalRepository goalRepository;

    @Autowired
    private CaptainRepository captainRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public Captain _createCaptain(Team team) {
        Captain captain = new Captain();
        captain.setCaptainName("CAPTAIN " + team.getTeamName());
        captain.setCaptainEmail("CAPTAIN EMAIL" + team.getTeamName());
        captain.setCaptainPhone("CAPTAIN PHONE" + team.getTeamName());

        captain.setTeam(team);
        team.setCaptain(captain);

        return captain;
    }

    public void _createPlayerList(Team team) {
        for(int i=0; i<NUMBER_OF_PLAYERS_IN_TEAM; i++) {
            _createPlayer(team, team.getTeamName() + " " + i);
        }
    }

    public void _createPlayer(Team team, String name) {
        Player player = new Player();
        player.setPlayerName(name);
        player.setTeam(team);
        team.addPlayer(player);
    }

    public Goal _createGoal(Game game, Player player, Integer time) {
        Goal goal = new Goal();
        goal.setTime(time);
        goal.setPlayer(player);
        goal.setGame(game);
        return goal;
    }

    public Tour _createTour(Integer tourNumber) {
        Tour tour = new Tour();
        tour.setTourNumber(tourNumber);
        return tour;
    }

    public void _addGameToTour(Tour tour, Game game) {
        tour.addGame(game);
        game.setTour(tour);
    }

    public Game _createGame(Team homeTeam, Team guestTeam, Tour tour) {
        Game game = new Game();
        game.setFirstTeam(homeTeam);
        game.setSecondTeam(guestTeam);
        _addGameToTour(tour, game);
        return game;
    }

    public Team _createTeam(String name) {
        Team team = new Team();
        team.setTeamName(name);
        team = teamRepository.save(team);
        Captain captain = _createCaptain(team);
        captainRepository.save(captain);
        _createPlayerList(team);
        teamRepository.save(team);
        return team;
    }

    public void _createLeague() {
        List<Team> teamList = new ArrayList<>();

        for(int i=0; i<NUMBER_OF_TEAMS; i++) {
            Team team = _createTeam("TEAM " + i);
            teamList.add(team);
        }


        for(int i=0; i<NUMBER_OF_TOURS; i++) {

            switch (Integer.valueOf(i)) {
                case 0:
                    Tour tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(0), teamList.get(9), tour);
                    _createGame(teamList.get(1), teamList.get(8), tour);
                    _createGame(teamList.get(2), teamList.get(7), tour);
                    _createGame(teamList.get(3), teamList.get(6), tour);
                    _createGame(teamList.get(4), teamList.get(5), tour);

                    tourRepository.save(tour);
                    break;
                case 1:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(9), teamList.get(5), tour);
                    _createGame(teamList.get(6), teamList.get(4), tour);
                    _createGame(teamList.get(7), teamList.get(3), tour);
                    _createGame(teamList.get(8), teamList.get(2), tour);
                    _createGame(teamList.get(0), teamList.get(1), tour);

                    tourRepository.save(tour);
                    break;
                case 2:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(1), teamList.get(9), tour);
                    _createGame(teamList.get(2), teamList.get(0), tour);
                    _createGame(teamList.get(3), teamList.get(8), tour);
                    _createGame(teamList.get(4), teamList.get(7), tour);
                    _createGame(teamList.get(5), teamList.get(6), tour);

                    tourRepository.save(tour);
                    break;
                case 3:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(9), teamList.get(6), tour);
                    _createGame(teamList.get(7), teamList.get(5), tour);
                    _createGame(teamList.get(8), teamList.get(4), tour);
                    _createGame(teamList.get(0), teamList.get(3), tour);
                    _createGame(teamList.get(1), teamList.get(2), tour);

                    tourRepository.save(tour);
                    break;
                case 4:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(2), teamList.get(9), tour);
                    _createGame(teamList.get(3), teamList.get(1), tour);
                    _createGame(teamList.get(4), teamList.get(0), tour);
                    _createGame(teamList.get(5), teamList.get(8), tour);
                    _createGame(teamList.get(4), teamList.get(7), tour);

                    tourRepository.save(tour);
                    break;
                case 5:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(9), teamList.get(7), tour);
                    _createGame(teamList.get(8), teamList.get(6), tour);
                    _createGame(teamList.get(0), teamList.get(5), tour);
                    _createGame(teamList.get(1), teamList.get(4), tour);
                    _createGame(teamList.get(2), teamList.get(3), tour);

                    tourRepository.save(tour);
                    break;
                case 6:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(3), teamList.get(9), tour);
                    _createGame(teamList.get(4), teamList.get(2), tour);
                    _createGame(teamList.get(5), teamList.get(1), tour);
                    _createGame(teamList.get(6), teamList.get(0), tour);
                    _createGame(teamList.get(7), teamList.get(8), tour);

                    tourRepository.save(tour);
                    break;
                case 7:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(9), teamList.get(8), tour);
                    _createGame(teamList.get(0), teamList.get(7), tour);
                    _createGame(teamList.get(1), teamList.get(6), tour);
                    _createGame(teamList.get(2), teamList.get(5), tour);
                    _createGame(teamList.get(3), teamList.get(4), tour);

                    tourRepository.save(tour);
                    break;
                case 8:
                    tour = _createTour(i);
                    tour.setTourNumber(i);

                    _createGame(teamList.get(4), teamList.get(9), tour);
                    _createGame(teamList.get(5), teamList.get(3), tour);
                    _createGame(teamList.get(6), teamList.get(2), tour);
                    _createGame(teamList.get(7), teamList.get(1), tour);
                    _createGame(teamList.get(8), teamList.get(0), tour);

                    tourRepository.save(tour);
                    break;
            }
        }
    }


}