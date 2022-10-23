=========
cli
=========


permanent alias @ DOSKEY
----------------------------

        reference:
        
        # commands  and ref
        👉 https://superuser.com/questions/1134368/create-permanent-in-windows-cmd 
        
        
        # how to use in powershell
        👉 https://stackoverflow.com/questions/51604545/how-do-i-call-a-doskey-alias-from-powershell
        
        
        # misc
        👉 https://stackoverflow.com/questions/41733192/set-aliases-in-powershell-using-doskey-macros

        👉 https://devblogs.microsoft.com/premier-developer/getting-doskey-macros-to-work-in-powershell/
        
        👉 https://superuser.com/questions/507387/autorun-for-powershell 

.. code-block:: bash

    # create a file named macros.doskey and save below content in it
    
        word=echo "this is a really, really long sentence. Welcome %USERNAME% !"
        c=cls
        l=dir


.. code-block:: bash
    
    $ reg add "HKCU\Software\Microsoft\Command Processor" /v Autorun /d "doskey /macrofile=\"C:\Users\DELL\macros.doskey"" /f
    $ reg query "HKCU\Software\Microsoft\Command Processor" /v Autorun

.. code-block:: bash

    # FOR POWERSHELL

    # 1 - open powershell

    $ notepad $profile

    # write below content:

        Remove-Module PSReadLine
        doskey /exename=powershell.exe /macrofile="C:\Users\DELL\macros.doskey"
    
