package com.ahmadabuhasan.repositorydanlivedata.utils;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.MovieResponse;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.TVShowResponse;

import java.util.ArrayList;

public class DataDummy {

    public static ArrayList<MovieEntity> generateDummyMovies() {
        ArrayList<MovieEntity> movies = new ArrayList<>();

        movies.add(new MovieEntity(
                "634649",
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "https://image.tmdb.org/t/p/w500/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "2021-12-15",
                "Spider-Man: No Way Home",
                "8.4"
        ));
        movies.add(new MovieEntity(
                "774825",
                "The fearless one-eyed weasel Buck teams up with mischievous possum brothers Crash & Eddie as they head off on a new adventure into Buck's home: The Dinosaur World.",
                "https://image.tmdb.org/t/p/w500/zzXFM4FKDG7l1ufrAkwQYv2xvnh.jpg",
                "2022-01-28",
                "The Ice Age Adventures of Buck Wild",
                "7.4"
        ));
        movies.add(new MovieEntity(
                "524434",
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "https://image.tmdb.org/t/p/w500/bcCBq9N1EMo3daNIjWJ8kYvrQm6.jpg",
                "2021-11-03",
                "Eternals",
                "7.2"
        ));
        movies.add(new MovieEntity(
                "568124",
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "https://image.tmdb.org/t/p/w500/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                "2021-11-24",
                "Encanto",
                "7.8"
        ));
        movies.add(new MovieEntity(
                "585083",
                "When Van Helsing's mysterious invention, the \"Monsterfication Ray,\" goes haywire, Drac and his monster pals are all transformed into humans, and Johnny becomes a monster. In their new mismatched bodies, Drac and Johnny must team up and race across the globe to find a cure before it's too late, and before they drive each other crazy.",
                "https://image.tmdb.org/t/p/w500/teCy1egGQa0y8ULJvlrDHQKnxBL.jpg",
                "2022-01-13",
                "Hotel Transylvania: Transformania",
                "7.6"
        ));
        movies.add(new MovieEntity(
                "425909",
                "When a single mom and her two kids arrive in a small town, they begin to discover their connection to the original Ghostbusters and the secret legacy their grandfather left behind.",
                "https://image.tmdb.org/t/p/w500/sg4xJaufDiQl7caFEskBtQXfD4x.jpg",
                "2021-11-11",
                "Ghostbusters: Afterlife",
                "7.7"
        ));
        movies.add(new MovieEntity(
                "801071",
                "When a vintage Jack-in-the-box is opened by a dying woman, she enters into a deal with the demon within that would see her illness cured in return for helping it claim six innocent victims.",
                "https://image.tmdb.org/t/p/w500/3Ib8vlWTrAKRrTWUrTrZPOMW4jp.jpg",
                "2022-01-03",
                "The Jack in the Box: Awakening",
                "5.1"
        ));
        movies.add(new MovieEntity(
                "766907",
                "An ex-NYPD officer-turned-sheriff of a small rural Georgia town has to contend with a gang of thieves who have taken a wealthy doctor hostage.",
                "https://image.tmdb.org/t/p/w500/daeVrgyj0ue8qb3AHyU3UeCwoZz.jpg",
                "2022-01-07",
                "American Siege",
                "5.3"
        ));
        movies.add(new MovieEntity(
                "438695",
                "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
                "https://image.tmdb.org/t/p/w500/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg",
                "2021-12-01",
                "Sing 2",
                "8.2"
        ));
        movies.add(new MovieEntity(
                "624860",
                "Plagued by strange memories, Neo's life takes an unexpected turn when he finds himself back inside the Matrix.",
                "https://image.tmdb.org/t/p/w500/8c4a8kE7PizaGQQnditMmI1xbRp.jpg",
                "2021-12-16",
                "The Matrix Resurrections",
                "6.8"
        ));
        movies.add(new MovieEntity(
                "460458",
                "Once the booming home of pharmaceutical giant Umbrella Corporation, Raccoon City is now a dying Midwestern town. The company’s exodus left the city a wasteland…with great evil brewing below the surface. When that evil is unleashed, the townspeople are forever…changed…and a small group of survivors must work together to uncover the truth behind Umbrella and make it through the night.",
                "https://image.tmdb.org/t/p/w500/7uRbWOXxpWDMtnsd2PF3clu65jc.jpg",
                "2021-11-24",
                "Resident Evil: Welcome to Raccoon City",
                "6.1"
        ));
        return movies;
    }

    public static ArrayList<TVShowEntity> generateDummyTVShows() {
        ArrayList<TVShowEntity> tvShows = new ArrayList<>();

        tvShows.add(new TVShowEntity(
                "114695",
                "Revisit the epic heroes, villains and moments from across the MCU in preparation for the stories still to come. Each dynamic segment feeds directly into the upcoming series — setting the stage for future events. This series weaves together the many threads that constitute the unparalleled Marvel Cinematic Universe.",
                "https://image.tmdb.org/t/p/w500/EpDuYIK81YtCUT3gH2JDpyj8Qk.jpg",
                "2021-01-08",
                "Marvel Studios: Legends",
                "7.5"
        ));
        tvShows.add(new TVShowEntity(
                "90",
                "Revealing the dark truth that aviation safety improves one crash at a time, Mayday  investigates legendary aviation disasters to find out what went wrong and why.\n\nBased on cockpit voice recorders, accident reports and eyewitness accounts, every episode also features interviews, state-of-the-art CGI and gripping reenactments.",
                "https://image.tmdb.org/t/p/w500/dTTl7DR23zr8IlPSMh2Vcfumyo3.jpg",
                "2003-09-03",
                "Mayday",
                "8.2"
        ));
        tvShows.add(new TVShowEntity(
                "45",
                "This fast-paced and stunt-filled motor show tests whether cars, both mundane and extraordinary, live up to their manufacturers' claims. The long-running show travels to locations around the world, performing extreme stunts and challenges to see what the featured cars are capable of doing. The current hosts are Paddy Mcguinness, Chris Harris and Andrew \"Freddie\" Flintoff.",
                "https://image.tmdb.org/t/p/w500/aqM6QnuhSXzjHlKbXyKUqxaGiWu.jpg",
                "2002-10-20",
                "Top Gear",
                "7.4"
        ));
        tvShows.add(new TVShowEntity(
                "3562",
                "PBS' premier science series helps viewers of all ages explore the science behind the headlines. Along the way, NOVA demystifies science and technology, and highlights the people involved in scientific pursuits.",
                "https://image.tmdb.org/t/p/w500/giUBXYnDAaJgNqA6iE3BMVE2EHp.jpg",
                "1974-03-03",
                "NOVA",
                "7.1"
        ));
        tvShows.add(new TVShowEntity(
                "87083",
                "Drivers, managers and team owners live life in the fast lane -- both on and off the track -- during one cutthroat season of Formula 1 racing.",
                "https://image.tmdb.org/t/p/w500/hZZpqv9bKo9tUMmQY54HIJcgyqx.jpg",
                "2019-03-08",
                "Formula 1: Drive to Survive",
                "8.3"
        ));
        tvShows.add(new TVShowEntity(
                "137003",
                "The investigators behind infamous serial killer cases reveal the harrowing, chilling details of their extraordinary efforts in this true crime series.",
                "https://image.tmdb.org/t/p/w500/628U5ybT3fV0gGbT41Lk3R15Ya0.jpg",
                "2021-11-04",
                "Catching Killers",
                "6.4"
        ));
        tvShows.add(new TVShowEntity(
                "32608",
                "Did intelligent beings from outer space visit Earth thousands of years ago? From the age of the dinosaurs to ancient Egypt, from early cave drawings to continued mass sightings in the US, each episode gives historic depth to the questions, speculations, provocative controversies, first-hand accounts and grounded theories surrounding this age old debate.",
                "https://image.tmdb.org/t/p/w500/8yR1FK6z1Gx0pyvyXRJrvbxOyuU.jpg",
                "2010-04-20",
                "Ancient Aliens",
                "6.9"
        ));
        tvShows.add(new TVShowEntity(
                "118924",
                "Go behind the scenes of the shows and movies of the Marvel Cinematic Universe, following the filmmakers, cast and crew, and Marvel heroes every step of the way.",
                "https://image.tmdb.org/t/p/w500/v2BHRwtQVkt5fssLdo5MpFgHJPY.jpg",
                "2021-03-12",
                "Marvel Studios: Assembled",
                "7.4"
        ));
        tvShows.add(new TVShowEntity(
                "1181",
                "TV's most-watched history series brings to life the compelling stories from our past that inform our understanding of the world today.",
                "https://image.tmdb.org/t/p/w500/g0CcpIzTA3nWETpLiatdnTcU2Qn.jpg",
                "1988-10-04",
                "American Experience",
                "8.4"
        ));
        tvShows.add(new TVShowEntity(
                "10472",
                "Now the longest-running music series in American television history, ACL showcases popular music legends and innovators from every genre.",
                "https://image.tmdb.org/t/p/w500/qBVRuTUki4okdGOO5TJJZb99Q6X.jpg",
                "1975-01-01",
                "Austin City Limits",
                "6.1"
        ));
        tvShows.add(new TVShowEntity(
                "224",
                "BBC's football highlights and analysis.\n\n\"The longest-running football television programme in the world\" as recognised by Guinness World Records in 2015.",
                "https://image.tmdb.org/t/p/w500/paRFRd11WlFOxVbGnzjjCBym7FW.jpg",
                "1964-08-22",
                "Match of the Day",
                "7.7"
        ));
        return tvShows;
    }

    public static ArrayList<MovieResponse> generateRemoteDummyMovie() {
        ArrayList<MovieResponse> movies = new ArrayList<>();

        movies.add(new MovieResponse(
                "634649",
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "https://image.tmdb.org/t/p/w500/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "2021-12-15",
                "Spider-Man: No Way Home",
                "8.4"
        ));
        movies.add(new MovieResponse(
                "774825",
                "The fearless one-eyed weasel Buck teams up with mischievous possum brothers Crash & Eddie as they head off on a new adventure into Buck's home: The Dinosaur World.",
                "https://image.tmdb.org/t/p/w500/zzXFM4FKDG7l1ufrAkwQYv2xvnh.jpg",
                "2022-01-28",
                "The Ice Age Adventures of Buck Wild",
                "7.4"
        ));
        movies.add(new MovieResponse(
                "524434",
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "https://image.tmdb.org/t/p/w500/bcCBq9N1EMo3daNIjWJ8kYvrQm6.jpg",
                "2021-11-03",
                "Eternals",
                "7.2"
        ));
        movies.add(new MovieResponse(
                "568124",
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "https://image.tmdb.org/t/p/w500/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                "2021-11-24",
                "Encanto",
                "7.8"
        ));
        movies.add(new MovieResponse(
                "585083",
                "When Van Helsing's mysterious invention, the \"Monsterfication Ray,\" goes haywire, Drac and his monster pals are all transformed into humans, and Johnny becomes a monster. In their new mismatched bodies, Drac and Johnny must team up and race across the globe to find a cure before it's too late, and before they drive each other crazy.",
                "https://image.tmdb.org/t/p/w500/teCy1egGQa0y8ULJvlrDHQKnxBL.jpg",
                "2022-01-13",
                "Hotel Transylvania: Transformania",
                "7.6"
        ));
        movies.add(new MovieResponse(
                "425909",
                "When a single mom and her two kids arrive in a small town, they begin to discover their connection to the original Ghostbusters and the secret legacy their grandfather left behind.",
                "https://image.tmdb.org/t/p/w500/sg4xJaufDiQl7caFEskBtQXfD4x.jpg",
                "2021-11-11",
                "Ghostbusters: Afterlife",
                "7.7"
        ));
        movies.add(new MovieResponse(
                "801071",
                "When a vintage Jack-in-the-box is opened by a dying woman, she enters into a deal with the demon within that would see her illness cured in return for helping it claim six innocent victims.",
                "https://image.tmdb.org/t/p/w500/3Ib8vlWTrAKRrTWUrTrZPOMW4jp.jpg",
                "2022-01-03",
                "The Jack in the Box: Awakening",
                "5.1"
        ));
        movies.add(new MovieResponse(
                "766907",
                "An ex-NYPD officer-turned-sheriff of a small rural Georgia town has to contend with a gang of thieves who have taken a wealthy doctor hostage.",
                "https://image.tmdb.org/t/p/w500/daeVrgyj0ue8qb3AHyU3UeCwoZz.jpg",
                "2022-01-07",
                "American Siege",
                "5.3"
        ));
        movies.add(new MovieResponse(
                "438695",
                "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
                "https://image.tmdb.org/t/p/w500/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg",
                "2021-12-01",
                "Sing 2",
                "8.2"
        ));
        movies.add(new MovieResponse(
                "624860",
                "Plagued by strange memories, Neo's life takes an unexpected turn when he finds himself back inside the Matrix.",
                "https://image.tmdb.org/t/p/w500/8c4a8kE7PizaGQQnditMmI1xbRp.jpg",
                "2021-12-16",
                "The Matrix Resurrections",
                "6.8"
        ));
        movies.add(new MovieResponse(
                "460458",
                "Once the booming home of pharmaceutical giant Umbrella Corporation, Raccoon City is now a dying Midwestern town. The company’s exodus left the city a wasteland…with great evil brewing below the surface. When that evil is unleashed, the townspeople are forever…changed…and a small group of survivors must work together to uncover the truth behind Umbrella and make it through the night.",
                "https://image.tmdb.org/t/p/w500/7uRbWOXxpWDMtnsd2PF3clu65jc.jpg",
                "2021-11-24",
                "Resident Evil: Welcome to Raccoon City",
                "6.1"
        ));
        return movies;
    }

    public static ArrayList<TVShowResponse> generateRemoteDummyTVShows() {
        ArrayList<TVShowResponse> tvShows = new ArrayList<>();

        tvShows.add(new TVShowResponse(
                "114695",
                "Revisit the epic heroes, villains and moments from across the MCU in preparation for the stories still to come. Each dynamic segment feeds directly into the upcoming series — setting the stage for future events. This series weaves together the many threads that constitute the unparalleled Marvel Cinematic Universe.",
                "https://image.tmdb.org/t/p/w500/EpDuYIK81YtCUT3gH2JDpyj8Qk.jpg",
                "2021-01-08",
                "Marvel Studios: Legends",
                "7.5"
        ));
        tvShows.add(new TVShowResponse(
                "90",
                "Revealing the dark truth that aviation safety improves one crash at a time, Mayday  investigates legendary aviation disasters to find out what went wrong and why.\n\nBased on cockpit voice recorders, accident reports and eyewitness accounts, every episode also features interviews, state-of-the-art CGI and gripping reenactments.",
                "https://image.tmdb.org/t/p/w500/dTTl7DR23zr8IlPSMh2Vcfumyo3.jpg",
                "2003-09-03",
                "Mayday",
                "8.2"
        ));
        tvShows.add(new TVShowResponse(
                "45",
                "This fast-paced and stunt-filled motor show tests whether cars, both mundane and extraordinary, live up to their manufacturers' claims. The long-running show travels to locations around the world, performing extreme stunts and challenges to see what the featured cars are capable of doing. The current hosts are Paddy Mcguinness, Chris Harris and Andrew \"Freddie\" Flintoff.",
                "https://image.tmdb.org/t/p/w500/aqM6QnuhSXzjHlKbXyKUqxaGiWu.jpg",
                "2002-10-20",
                "Top Gear",
                "7.4"
        ));
        tvShows.add(new TVShowResponse(
                "3562",
                "PBS' premier science series helps viewers of all ages explore the science behind the headlines. Along the way, NOVA demystifies science and technology, and highlights the people involved in scientific pursuits.",
                "https://image.tmdb.org/t/p/w500/giUBXYnDAaJgNqA6iE3BMVE2EHp.jpg",
                "1974-03-03",
                "NOVA",
                "7.1"
        ));
        tvShows.add(new TVShowResponse(
                "87083",
                "Drivers, managers and team owners live life in the fast lane -- both on and off the track -- during one cutthroat season of Formula 1 racing.",
                "https://image.tmdb.org/t/p/w500/hZZpqv9bKo9tUMmQY54HIJcgyqx.jpg",
                "2019-03-08",
                "Formula 1: Drive to Survive",
                "8.3"
        ));
        tvShows.add(new TVShowResponse(
                "137003",
                "The investigators behind infamous serial killer cases reveal the harrowing, chilling details of their extraordinary efforts in this true crime series.",
                "https://image.tmdb.org/t/p/w500/628U5ybT3fV0gGbT41Lk3R15Ya0.jpg",
                "2021-11-04",
                "Catching Killers",
                "6.4"
        ));
        tvShows.add(new TVShowResponse(
                "32608",
                "Did intelligent beings from outer space visit Earth thousands of years ago? From the age of the dinosaurs to ancient Egypt, from early cave drawings to continued mass sightings in the US, each episode gives historic depth to the questions, speculations, provocative controversies, first-hand accounts and grounded theories surrounding this age old debate.",
                "https://image.tmdb.org/t/p/w500/8yR1FK6z1Gx0pyvyXRJrvbxOyuU.jpg",
                "2010-04-20",
                "Ancient Aliens",
                "6.9"
        ));
        tvShows.add(new TVShowResponse(
                "118924",
                "Go behind the scenes of the shows and movies of the Marvel Cinematic Universe, following the filmmakers, cast and crew, and Marvel heroes every step of the way.",
                "https://image.tmdb.org/t/p/w500/v2BHRwtQVkt5fssLdo5MpFgHJPY.jpg",
                "2021-03-12",
                "Marvel Studios: Assembled",
                "7.4"
        ));
        tvShows.add(new TVShowResponse(
                "1181",
                "TV's most-watched history series brings to life the compelling stories from our past that inform our understanding of the world today.",
                "https://image.tmdb.org/t/p/w500/g0CcpIzTA3nWETpLiatdnTcU2Qn.jpg",
                "1988-10-04",
                "American Experience",
                "8.4"
        ));
        tvShows.add(new TVShowResponse(
                "10472",
                "Now the longest-running music series in American television history, ACL showcases popular music legends and innovators from every genre.",
                "https://image.tmdb.org/t/p/w500/qBVRuTUki4okdGOO5TJJZb99Q6X.jpg",
                "1975-01-01",
                "Austin City Limits",
                "6.1"
        ));
        tvShows.add(new TVShowResponse(
                "224",
                "BBC's football highlights and analysis.\n\n\"The longest-running football television programme in the world\" as recognised by Guinness World Records in 2015.",
                "https://image.tmdb.org/t/p/w500/paRFRd11WlFOxVbGnzjjCBym7FW.jpg",
                "1964-08-22",
                "Match of the Day",
                "7.7"
        ));
        return tvShows;
    }
}