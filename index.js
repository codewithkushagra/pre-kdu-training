var count=0;
            function showMenu()
            {
                console.log(count);
                if(count%2==0)
                {
                    document.getElementById("menu").style.display="flex";
                    document.getElementById("navbar").style.display="flex";
                    document.getElementById("navbar").style.flexDirection="column";
                    document.getElementById("navbar").style.backgroundColor="rgb(156, 99, 52)";
                }
                else
                {
                    document.getElementById("menu").style.display="none";
                    document.getElementById("navbar").style.backgroundColor="black";
                }
                count++;
            }