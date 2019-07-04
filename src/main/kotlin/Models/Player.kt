package Models

import java.util.*

data class Player(
    val id: Int,
    val name: String,
    val age: Int,
    val photo: String,
    val nationality: String,
    val flag: String,
    val overall: Int,
    val potential: Int,
    val club: String,
    val clubLogo: String,
    val value: String,
    val wage: String,
    val special: Int,
    val preferredFoot: String,
    val internalReputation: Int,
    val weakFoot: Int,
    val workRate: String,
    val bodyType: String,
    val realFace: Boolean,
    val position: String,
    val jerseyNumber: Int,
    val joined: Date,
    val loanedFrom: String,
    val contractValidUntil: String,
    val Height: String,
    val Weight: String
    )