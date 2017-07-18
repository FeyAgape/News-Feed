# News-Feed
A News Feed App

An app that connects to the Internet to provide news articles.

The goal is to create a News feed app which gives a user regularly-updated news from the internet.

This project is about combining various ideas and skills we’ve been practicing throughout the course. They include:

Connecting to an API

Parsing the response of the API

Handling error cases gracefully

Updating information regularly

Doing network operations independent of the Activity lifecycle

App contains a main screen which displays multiple news stories

List Item Contents: Each list item on the main screen displays relevant text and information about the story. Required fields include the title of the article and the name of the section that it belongs to.

Main Screen Updates: Stories shown on the main screen update properly whenever new news data is fetched from the API.

Story Intents: Clicking on a story opens the story in the user’s browser.

Api Query: App queries the content.guardianapis.com api to fetch news stories related to the topic chosen by the student, using either the ‘test’ api key or the student’s key.

Use of Loaders: Networking operations are done using a Loader rather than an AsyncTask.
