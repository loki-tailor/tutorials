=================
+ notes @ sphinx
=================

.. role:: raw-html(raw)
    :format: html

.. role:: bash(code)
    :language: bash

:raw-html:`<br />`
   
.. this is a sample comment

Issues Faced
------------
* `stack: python: Could not find a version that satisfies the requirement <package> <https://stackoverflow.com/questions/32302379/could-not-find-a-version-that-satisfies-the-requirement-package>`_
  
* `stack: vscode: Visual studio code cmd error: Cannot be loaded because running scripts is disabled on this system <https://stackoverflow.com/questions/56199111/visual-studio-code-cmd-error-cannot-be-loaded-because-running-scripts-is-disabl>`_

* `stack: sphinx: WARNING: document isn't included in any toctree for included file <https://stackoverflow.com/a/40725923/7415499>`_

* `stack: sphinx: How do I create a new line with reStructuredText? <https://stackoverflow.com/questions/51198270/how-do-i-create-a-new-line-with-restructuredtext>`_

* `todo: stack: sphinx: Inline code highlighting in reStructuredText <https://stackoverflow.com/questions/10870719/inline-code-highlighting-in-restructuredtext>`_

* `todo: stack: sphinx: Sphinx inline code highlight <https://stackoverflow.com/questions/21591107/sphinx-inline-code-highlight>`_

commands used
--------------------

.. code-block:: console

    $ python -m pip install sphinx
    $ pip install sphinx

.. code-block:: console

    $ sphinx-build --version
    $ sphinx-quickstart docs
    $ sphinx-build -b html docs/source/ docs/build/html

.. code-block:: console

    $ cd docs ; make html
    $ make clean
    $ make html
    $ make help
    $ make epub

.. code-block:: console

    rmdir /s /q build & make html

    Remove-Item -LiteralPath "build" -Force -Recurse; sphinx-build -b html source/ build/html

Notes
------------

* You should now populate your master file "`F:\\git\\tutorials\\python\\sphnix-demo-1\\docs\\source\\index.rst`" and create other documentation source files.

* Use the Makefile to build the docs, like so: ``make builder`` where "builder" is one of the supported builders, e.g. html, latex or linkcheck
  
* ``toctree`` = table of contents tree

TODO:
-------------
* maxdepth - what is it and why exactly it is used?
* Arguments / Options / Content?
* nested toctree
* why does ``.pyc`` file get created and when and how to avoid it?