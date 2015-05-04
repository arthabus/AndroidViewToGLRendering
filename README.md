# Android View to Open GL Rendering
Demo for rendering android views to OpenGL texture

It uses OpenGL ES 2.0 to render Android's View in real time

![](/screenshot.png)

# How to use

1. Init GLSurfaceView as usual
2. Create a subclass of ViewToGLRenderer and set it to the GLSurfaceView instance
3. Extend the View you'd like to be rendered to GL texture
4. Provide an instance of ViewToGLRenderer to the View
5. Override the View's onDraw method to draw it to the canvas provided by ViewToGLRenderer.onDrawViewBegin() method
6. Also make sure fragment shader includes the following directive alongside with the correct sampler:

    \#extension GL_OES_EGL_image_external : require
    
    uniform samplerExternalOES u_Texture;    // The input texture.



# Inspired by

This stackowerflow question: http://stackoverflow.com/questions/12499396/is-it-possible-to-render-an-android-view-to-an-opengl-fbo-or-texture

The research found on this site: http://www.felixjones.co.uk/neo%20website/Android_View/

Also some routine code snippets were used from Lesson 4 of this project: https://github.com/learnopengles/Learn-OpenGLES-Tutorials  

# Feedback

Feel free to leave a comment if rendering is not working as expected on any particular device
