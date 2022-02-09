
---
### 1/31/22 : : The search for validation (or invalidation) continues
Further research shows that (to-date) LMs like GPT-J will be insufficient for task-planning agents,
leading to the idea that initial concepts may only focus on chatting with players.

See the following paper on the current state of action planning:  
[1/18/22 : : Language Models as Zero-Shot Planners:
Extracting Actionable Knowledge for Embodied Agents](https://arxiv.org/pdf/2201.07207.pdf)
- Preceding research on simulating activities in a virtual environment:  
  [6/19/18 : : VirtualHome: Simulating Household Activities via Programs](https://arxiv.org/pdf/1806.07011.pdf)

What is needed to implement a chatbot in minecraft?
- Can minecraft mods call external APIs? YES
- Can a chatbot be implemented in minecraft? YES  
  [4/6/21 : : Minecraft-AI-Chatbot : : CurseForge](https://www.curseforge.com/minecraft/mc-mods/ai-chatbot)  
  [Chatter-Bot-API (last updated 5 years ago)](https://github.com/pierredavidbelanger/chatter-bot-api)
- Can entities be interacted with in text chat?
    - this has not been widely published by mod makers yet 0-o
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
and may serve as a goalpost in the future.
#### Related Papers:
- [11/4/21 : : A Consciousness-Inspired Planning Agent for Model-Based Reinforcement Learning](https://arxiv.org/pdf/2106.02097.pdf)
- [5/7/21 : : SPOTTER: Extending Symbolic Planning Operators through Targeted Reinforcement Learning](https://www.ifaamas.org/Proceedings/aamas2021/pdfs/p1118.pdf)
- See more on [MiniGrid's GitHub page](https://github.com/maximecb/gym-minigrid#minimalistic-gridworld-environment-minigrid)
---

TODO: Continue research on ai-generated structures [here](https://arxiv.org/pdf/2103.08737.pdf)

---
