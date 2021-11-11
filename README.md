# PoC: GPT in Minecraft
This project is designed to be a **proof of concept** for incorporating
GPT-3 into a Minecraft Mod. In this example, I plan to use GPT-J as an
open source alternative with the benefits (and drawbacks) of increased performance.

# Philosophy of Design, by rad1osketxh
I'm not sure how else to start planning what I want, so this section is dedicated to
getting across how I want to start blogging, designing assets for eventually vlogging &
producing content online.

This section may also serve as an initial blog post, so **~Hello There!  ! ! Welcome to my Blog!!~**

Let's go back through the notes, shall we?

## Research
It's important to know the full functionality of the extensive
libraries that surround both the Minecraft engine and GPT-J, so I'd like to begin
the process of wrapping my head, as well as my code, around the basics.

**What I know so far, TODO resources & documentation:**
1. Environment config for Minecraft mods
2. Basic Minecraft modding
3. Environment config for GPT-J development

    - TODO: please refer to (and expand upon) links in the ```Resources```
      section
4. Basic GPT-J methods of function

**What I want to know, TODO find external resources & documentation:**
1. Tokenization of in-game events

    - TODO: This should be my first section to design tests for
    - **Abstract Structuring**:  
      **Cool, we made the Env, What do we do next?**
        - We need to collect data representing continuous in-game activity,
          and feed this data to the Pre-Training algorithm
        - This data should be collected from the game in a manner that
          roughly replicates the senses of players, who ought to be assigned to
          collect the data:
            - Sight; Recognition of blocks, entities
            - Sound; Listening to in-game chat & surrounding events
                - Speech; The mob that chats back! (Global/Local)
                - Sense of location; generating callouts for locations.
            - Touch; Agility for combat???
                - This section confuses me; while it seems possible to tokenize


2. Communication between MC Engine and GPT-J

    - TODO:
3. Methods for unique use-cases of GPT-J
4. A detailed list of in-game methods of controlling virtual characters
5. Decoding GPT-J responses into in-game actions
6. Optimization tactics for faster AI response time

## Development
Ongoing; Continuing research in the abstract; making additions to this README as an info hub.

## Works Cited: By Category
### Minecraft Modding: Communication with External Programs
TODO: Add related documentation
### GPT-J: Training to become an NPC in Minecraft
#### Papers:
* [Natural Language Supervision](https://cdn.openai.com/papers/Learning_Transferable_Visual_Models_From_Natural_Language_Supervision.pdf), related to our training technique.

[GPT-J GitHub Repo](https://github.com/kingoflolz/mesh-transformer-jax/#gpt-j-6b)
#### Development Pipeline:
>Examining existing software solutions to Copy™ and Paste™ into our Brand-New™ and Innovative™ Product™.
* [CAT\<nip\> Google Doc](https://docs.google.com/document/d/1SCi91qXdAKvHEEmFqTQnEpn1JX02fA6vRd7v2SCdmbs/edit)
    - \"A structured, highly accurate, and agile format for use with [AI Dungeon's](https://play.aidungeon.io/main/home) Griffin and Dragon models. CAT<nip> format makes use of optimized tokenization (documentation coming soon courtesy of RogueSphinx)\" - [Curious Nekomimi](https://www.reddit.com/user/curious_nekomimi/comments/kqu6zl/catnip_format_character_generator_nsfwsfw_version/?utm_source=share&utm_medium=web2x&context=3)
* [Environment Setup](https://github.com/kingoflolz/mesh-transformer-jax/blob/master/howto_finetune.md)
####
