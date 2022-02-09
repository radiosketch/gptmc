
---
### 1/31/22 : : The search for validation (or invalidation) continues
Further research shows that (to-date) Language Models (LMs) like GPT-Codex

See the following paper on the current state of action planning, or the related video by Yannic Kilcher:  
[1/18/22 : : Language Models as Zero-Shot Planners:
Extracting Actionable Knowledge for Embodied Agents](https://arxiv.org/pdf/2201.07207.pdf)  
[2/8/22 : : Yannic Kilcher's interview with an author of this paper](https://www.youtube.com/watch?v=OUCwujwE7bA)

LMs like GPT-3 or GPT-Codex were capable of generating plans for simple tasks ~60% correct on average, and rarely
completely executable; this was measured by human evaluations of generated plans, and compared with plans made by humans,
which were ~70% correct, and fully executable.

Researchers are more confident that a tailored language model akin to GPT-Codex, which was made to generate
computer code, would be best suited for generating a correctly-formatted list of planned actions.

A model such as this requires a list of every allowable combination of objects & actions to be embedded within it.
This 'bank' of actionable steps, once compiled and embedded into an LM, could feasibly be used by the LM to generate
the steps required to complete a given task.

> In VirtualHome, activities are expressed as programs. Each program consists of a
sequence of textual action steps, where each step is written as: [action] {arg}(idx). Each
action refers to one of the 42 atomic actions supported in VirtualHome, such as “walk” and “open”...  
> 
> pg. 4, paragraph 1

An example program for the task "Relax on sofa"; the indices are omitted as (1) in this case.

> [WALK] {living_room}(1)  
  [WALK] {television}(1)  
  [FIND] {television}(1)  
  [SWITCHON] {television}(1)  
  [FIND] {sofa}(1)  
  [SIT] {sofa}(1)  
  [TURNTO] {television}(1)  
  [WATCH] {television}(1)  
> 
> pg. 4, paragraph 2

Conclusions also mention that off-the-shelf LMs trained on generic English text aren't suitable for generating
executable programs. Off-the-shelf models also tend to struggle when asked to output into a usable format,
so another off-the-shelf LM, Sentence-RoBERTa, was used to translate the generated text into the proper format.
(Pg. 9, Paragraph 3)

In Minecraft, every possible interaction with an object is defined in its class-structure, so it may be 
possible to auto-generate this list of possible interactions and save time for the developers.

- Preceding research on simulating activities in a virtual environment:  
  [6/19/18 : : VirtualHome: Simulating Household Activities via Programs](https://arxiv.org/pdf/1806.07011.pdf)

Since research has not proven to achieve a fully functional action-planning agent powered by LMs, I would
much rather focus on what is indeed possible.  
What is needed to implement a chatbot in minecraft?
- Can minecraft mods call external APIs? YES  
- Can a chatbot be implemented in minecraft? YES  
  [4/6/21 : : Minecraft-AI-Chatbot : : CurseForge](https://www.curseforge.com/minecraft/mc-mods/ai-chatbot)  
  [Chatter-Bot-API (last updated 5 years ago)](https://github.com/pierredavidbelanger/chatter-bot-api)  
- Can entities be interacted with in text chat?  
    - Yes  
      [11/18 : : How Players Speak to an Intelligent Game Character Using Natural Language Messages](http://todigra.org/index.php/todigra/article/view/88/139)
---
### 2/7/22 : : Custom Environments with Stable Baselines 3  
A reinforcement learning package like Stable Baselines could be suitable to begin training in a
custom environment. Implementation of Minecraft as a training environment appears
questionably difficult.  

> Stable Baselines is a set of improved implementations of Reinforcement Learning (RL) algorithms based
on OpenAI Baselines : : [Stable Baselines Docs](https://stable-baselines.readthedocs.io/en/master/)  
- Part 3 of implementing a custom RL environment, by [sentdex](https://youtu.be/uKnjGn8fF70)  
  - Check back later for Part 4 where optimizations will be made to punishment strategies.
  
I should probably try to implement a custom environment in simpler open-source games as a learning
exercise. Moving up to a 2D sandbox game would be suitable for preparing to implement a training
environment in Minecraft.

---
### 2/8/22 : : Exploring RL Environments similar to Minecraft  
#### and a component analysis of Minecraft's features
Browsing the [RL-Baselines-Zoo](https://github.com/araffin/rl-baselines-zoo), some environments
are seen to have a few characteristics similar to Minecraft. A **very** similar environment should include
many of the qualities in the list below, which is subject to additions and simplification as
research continues:  

- Interactive world
- GUIs
  - Inventory management
  - Hot-bar
  - Main & off-hand
  - Tool blocks
- Open-ended exploration
- Chronological quest progression
- Necessary tasks for survival
- Mode**s** of speeding up progression
  - Tools
  - Better food
  - Armor
  - Faster transportation
  - Material upgrades
  - Enchantment upgrades
  - Potion effects
  - Beacons
- Biome**s** that possess distinct qualities
- FPV (First Person View)
  - unaware of map layout
  - aware of goals
    - survival tasks
    - quests
    - explored waypoints
- Room for creativity
  - Of expression
  - Of completion strategy
  - Of survival strategy  

An existing environment that fits a few of these qualities would be
 [MiniGrid](https://pythonawesome.com/minimalistic-gridworld-environment-minigrid/),
which is described as:  
> A simple, lightweight and fast Gym environments implementation of the famous gridworld : :
> [RL-Baselines-Zoo](https://github.com/araffin/rl-baselines-zoo#minigrid-envs)  

This environment could feasibly be modified to include even more of Minecraft's core features,
and could serve as a goalpost in the future.
#### Related Papers:
- [11/4/21 : : A Consciousness-Inspired Planning Agent for Model-Based Reinforcement Learning](https://arxiv.org/pdf/2106.02097.pdf)
- [5/7/21 : : SPOTTER: Extending Symbolic Planning Operators through Targeted Reinforcement Learning](https://www.ifaamas.org/Proceedings/aamas2021/pdfs/p1118.pdf)
- See more on [MiniGrid's GitHub page](https://github.com/maximecb/gym-minigrid#minimalistic-gridworld-environment-minigrid)
---

TODO: Continue research on current Minecraft-AI projects here: [7/29/19 : : Why Build an Assistant in Minecraft?](https://arxiv.org/pdf/1907.09273.pdf)
- [9/13/21 : : Learning to Ground Visual Objects for Visual Dialog](https://arxiv.org/pdf/2109.06013.pdf)

TODO: Continue research on ai-generated structures [here](https://arxiv.org/pdf/2103.08737.pdf)

---
