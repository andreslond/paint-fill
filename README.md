# paint-fill

Paint-fill is the implementation of a popular funciton in design softwares to paint the same color pixels surounding.

![3](https://user-images.githubusercontent.com/6624788/111289417-2220af00-8613-11eb-8ff1-5eccc627d88d.PNG)


## Usage

```java
Color[][] screen_colors = new ScreenBuilder().getSmallScreen();
Color newColor = Color.GREEN;
Point selectedPoint = new Point(4,0);
        
Color[][] newScreenColors = 
  PaintFill.initPaintFill(screen_colors, selectedPoint, newColor); # Returns the completee screen_colors array with internal color changes.

```

## License
MIT License

Copyright (c) 2020 Paint-fill

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
