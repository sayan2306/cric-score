package com.gb.cricscore.model.match;

import com.gb.cricscore.model.people.PlayingMembers;
import com.gb.cricscore.model.people.Team;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayedTeams {
    Team team1;
    Team team2;
    PlayingMembers t1PlayingMembers;
    PlayingMembers t2PlayingMembers;
}
