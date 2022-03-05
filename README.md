# NavigationComponenetBug
Component used: Navigation
Version used: 2.4.0-rc01
Devices/Android versions reproduced on:

In navigation component version 2.3.5 everything works fine but in version 2.4.0-rc01 I have some weird issues:

1.I have a destination change listener, in the back button click fragment is popped back but the destination listener is not called
2.When getting back, for example from Cfragment to Bfragment I print the current destination id it shows that the current destination is Cfragment but in UI app is on Bfragmnet

with downgrading to version 2.3.5 or using default navHostFragment all issues are solved.

this issue is submited and resolved
source:https://issuetracker.google.com/issues/214577959
