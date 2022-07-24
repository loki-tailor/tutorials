sample.rst @ $project
============================

$project will solve your problem of where to start with documentation,
by providing a basic explanation of how to do it easily.

Look how easy it is to use:

    import project
    # Get your stuff done
    project.do_stuff()

Features
--------

- Be awesome
- Make things faster

Installation
------------

Install $project by running:

    install project

Contribute
----------

- Issue Tracker: github.com/$project/$project/issues
- Source Code: github.com/$project/$project

Support
-------

If you are having issues, please let us know.
We have a mailing list located at: project@google-groups.com

License
-------

The project is licensed under the BSD license.

> ref @ https://www.writethedocs.org/guide/writing/beginners-guide-to-docs/

Demo: `Documenting Objects`
------------------------------

.. py:function:: enumerate(sequence[, start=0])

   Return an iterator that yields tuples of an index and an item of the
   *sequence*. (And so on.)

* The :py:func:`enumerate` function can be used for ...

Demo: `autodoc`
-------------------
.. autofunction:: io.open

.. .. automodule:: io
..    :members:

Demo: `Intersphinx`
---------------------
And now, you can write a cross-reference like :py:func:`io.open_code`. 

And now, you can write a cross-reference like :py:func:`io.open`. 

Any cross-reference that has no matching target in the current documentation set, will be looked up in the documentation sets configured in intersphinx_mapping 

(this needs access to the URL in order to download the list of valid targets).