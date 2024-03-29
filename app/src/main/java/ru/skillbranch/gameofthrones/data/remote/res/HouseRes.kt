package ru.skillbranch.gameofthrones.data.remote.res

import ru.skillbranch.gameofthrones.data.local.entities.House
import ru.skillbranch.gameofthrones.repositories.RootRepository.getHouseShortName

data class HouseRes(
    val url: String,
    val name: String,
    val region: String,
    val coatOfArms: String,
    val words: String,
    val titles: List<String> = listOf(),
    val seats: List<String> = listOf(),
    val currentLord: String,
    val heir: String,
    val overlord: String,
    val founded: String,
    val founder: String,
    val diedOut: String,
    val ancestralWeapons: List<String> = listOf(),
    val cadetBranches: List<Any> = listOf(),
    val swornMembers: List<String> = listOf()
){
    fun toHouse(): House {
        with (this) {
            return House(
                getHouseShortName(name),
                name,
                region,
                coatOfArms,
                words,
                titles,
                seats,
                currentLord,
                heir,
                overlord,
                founded,
                founder,
                diedOut,
                ancestralWeapons
            )
        }
    }

}