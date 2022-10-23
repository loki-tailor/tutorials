============
git
============

renaiming ``master`` to ``main``
------------------------------------

* ref @ https://gitbetter.substack.com/p/how-to-change-git-default-branch
* ref @ https://www.git-tower.com/learn/git/faq/git-rename-master-to-main 

.. code-block:: git

    # =============== ONE WHO IS DELETING ===============

    # -m <oldBranchName> <newBranchName> (renames branches w/o affecting history)
    $ git branch -m master main
    
    # -u attribute is used to set the upstream tracking for the branch.
    $ git puhs -u origin main

    # login to repo UI and manually change  the default branch from "master" to "main"
    
    $ git push origin --delete master


.. code-block:: git

    # =============== ONE WHO IS FETCHING POST DELETING ===============

    # Switch to the "master" branch:
    $ git checkout master

    # Rename it to "main":
    $ git branch -m master main

    # Get the latest commits (and branches!) from the remote:
    $ git fetch

    # Remove the existing tracking connection with "origin/master":
    $ git branch --unset-upstream

    # Create a new tracking connection with the new "origin/main" branch:
    $ git branch -u origin/main
